package com.example

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  var count = 0
  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(callback: js.Dynamic): Unit = {

    println("clicked")

    count += 1

    if(count>4){
      callback("bleep"+count)
    }
    callback(count)
  }
}