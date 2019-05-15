package io.radanalytics.weatherData

import smile.classification.DecisionTree

import smile.classification.cart
import scala.language.dynamics
import scala.language.implicitConversions

object weatherTree {

  def main(args: Array[String]): Unit = {
    val weather = read.arff("io/radanalytics/weatherData/data/weather.nominal.arff", 4)
    val trainingInstances = weather.toArray(Array(new Array[Double](weather.size())))
    val responseValues = weather.toArray(new Array[Int](weather.size()))

    val maxNodes = 200
    val splitRule = DecisionTree.SplitRule.ENTROPY
    val attributes = weather.attributes()

    val decisionTree = cart(trainingInstances, responseValues, maxNodes, attributes, splitRule)

    val weatherTest = read.arff("io/radanalytics/weatherData/data/weatherTest.nominal.arff", 4)
    val testInstances = weatherTest.toArray(Array(new Array[Double](weather.size())))
    val testResponseValues = weather.toArray(new Array[Int](weather.size()))

    val error = testInstances.zip(testResponseValues).count {
      case (testInstance, response) => decisionTree.predict(testInstance) != response
    }
    println("Number of errors in test data is "+error)

    val decisions = testInstances.map{
      decisionTree.predict(_) match{
        case 0 => "play"
        case 1 => "not playable weather"
      }
    }.toList
    System.out.println(decisionTree.dot());

  }



}
