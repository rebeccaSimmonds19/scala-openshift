FROM openshift/jenkins-slave-base-centos7
MAINTAINER Gerald Nunn <gnunn@redhat.com>

ENV SBT_VERSION 1.2.6
ENV SCALA_VERSION 2.12.7
ENV IVY_DIR=/var/cache/.ivy2
ENV SBT_DIR=/var/cache/.sbt

USER root

RUN INSTALL_PKGS="sbt-$SBT_VERSION" \
 && curl -s https://bintray.com/sbt/rpm/rpm > bintray-sbt-rpm.repo \
 && mv bintray-sbt-rpm.repo /etc/yum.repos.d/ \
 && yum install -y --enablerepo=centosplus $INSTALL_PKGS \
 && rpm -V $INSTALL_PKGS \
 && yum install -y https://downloads.lightbend.com/scala/$SCALA_VERSION/scala-$SCALA_VERSION.rpm \
 && yum clean all -y

USER 1001
