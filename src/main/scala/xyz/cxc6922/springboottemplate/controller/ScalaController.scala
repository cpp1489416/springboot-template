package xyz.cxc6922.springboottemplate.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}
import xyz.cxc6922.springboottemplate.model.dto.{LombokDto, RestApiResult}

@Controller
class ScalaController {

  @RequestMapping(value = Array("/testScala"))
  @ResponseBody
  def testScala(): Object = {
    val json = new RestApiResult()
    json.setCode(0)
    json.setInfo("成功")
    json.setMsg("scala success")
    json
  }

  @RequestMapping(value = Array("/testScalaLombok"))
  @ResponseBody
  def testScalaLombok(): Object = {
    val json = new LombokDto()
    json
  }
}