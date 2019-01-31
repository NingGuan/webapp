package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/IdChk")
public class IdchkController {
	
	@RequestMapping(method=RequestMethod.GET , value="/LocalIdChk")
	public List<String> localIdChk(@RequestParam(value="AcName",required=true)String AcName,
			@RequestParam(value="CerNo",required=true)String CerNo) {
		
		List<String> result = new ArrayList<String>();
		result.add("11");
		result.add("22");
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/index")
	public String index() {
		
		
		return "index";
	}
}
