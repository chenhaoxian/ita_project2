package com.oocl.ita.starkxiao.project2.admin.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PermissionJudgeFilter
 */
public class PermissionJudgeFilter implements Filter {
    /**
     * Default constructor. 
     */
    public PermissionJudgeFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		// pass the request along the filter chain
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		Boolean boolTemp = (Boolean)httpServletRequest.getSession().getAttribute("pass");
		
		if(boolTemp != null && boolTemp){
			chain.doFilter(httpServletRequest, response);
		}
		else{
			String requestOriginPath = request.getServletContext().getContextPath();
			httpServletResponse.sendRedirect(requestOriginPath+"/Login");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
