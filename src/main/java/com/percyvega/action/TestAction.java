package com.percyvega.action;

import com.percyvega.form.HelloWorldForm;
import com.percyvega.form.TestForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    public class TestAction extends Action {

        public ActionForward execute(ActionMapping mapping, ActionForm form,
                                     HttpServletRequest request, HttpServletResponse response) throws Exception {

            TestForm testForm = (TestForm) form;
            testForm.setMessage("message from testForm");

            return mapping.findForward("test");
        }

    }

