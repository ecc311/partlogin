/**
 * 
 */

/**
 * @author Alumno18
 *
 */
package Beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.deploy.LoginConfig;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		LoginForm lf = (LoginForm) form;
		HttpSession sessionOk = request.getSession(true);
		sessionOk.setAttribute("name",lf.getName());
		
		return mapping.findForward("success");
	}
}