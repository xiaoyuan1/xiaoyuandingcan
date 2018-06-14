<<<<<<< HEAD:hero/hero-web/src/main/java/edu/zut/cs/software/hero/Foot/web/spring/controller/FootController.java
package edu.zut.cs.software.hero.foot.web.spring.controller;
=======
/*package edu.zut.cs.software.hero.web.spring.controller;
>>>>>>> 602369c6cf1bda1d870d496eb7c58a077b1c3262:hero/hero-web/src/main/java/edu/zut/cs/software/hero/web/spring/controller/FootController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.web.spring.controller.GenericController;
import edu.zut.cs.software.hero.foot.service.FootManager;



@Controller
@RequestMapping("/foot")
public class FootController extends GenericController<Foot, Long, FootManager> {

	FootManager footManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/foot/index";
		return result;
	}
	@Autowired
	public void setStudentManager(FootManager footManager) {
		this.footManager = footManager;
		this.manager = this.footManager;
	}
}
*/