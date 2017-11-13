<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <TITLE><s:if test="#customer.cust_id!=null">修改客户</s:if><s:else>添加客户</s:else></TITLE>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
    <LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
          rel=stylesheet>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/DyAdd.js"></script>
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
    <%--<script type="text/javascript">--%>
        <%--function dynamicsAddSelected(position, dict_type_code, dict_id, selectedName) {--%>
            <%--var $select = $("<select name='" + selectedName + "'></select>");--%>
            <%--$select.append("<option value=''>请选择</option>");--%>
            <%--$.post("${pageContext.request.contextPath }/base_dictAction", {dict_type_code: dict_type_code},--%>
                <%--function (data) {--%>
                    <%--$.each( data, function(i, n){--%>
                       <%--var $option= $("<option value='"+n["dict_id"]+"'>"+n["dict_item_name"]+"</option>");--%>
                        <%--if(n["dict_id"]==dict_id){--%>
                            <%--$option.attr(fg                  vbnvm 56

                            "selected","selected");--%>
                        <%--};--%> nm
                        <%--$select.append($option);--%>
                    <%--});--%>

                <%--},"json");--%>
            <%--$("#" + position).append($select);--%>
        <%--}--%>
    <%--</script>--%>
    <script type="text/javascript">
        $(document).ready(function(){
            dynamicsAddSelected("customerGrade","006",<s:property value="#customer.cust_level.dict_id"/>,"cust_level.dict_id");
            dynamicsAddSelected("customerSource","009",<s:property value="#customer.cust_source.dict_id"/>,"cust_source.dict_id");
        });
    </script>
</HEAD>
<BODY>
<FORM id=form1 name=form1
      action="${pageContext.request.contextPath }/customerAction_add"
      method="post" >
    <input type="hidden" name="cust_id" value="<S:property value="#customer.cust_id"/>"/>
    <%--<input type="hidden" name="cust_level.dict_id" value="$('#customerGrade').val()" />--%>
    <%--<input type="hidden" name="cust_source.dict_id" value="$('#customerSource').val() "/>--%>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
                              border=0></TD>
            <TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
                height=20></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
                              border=0></TD>
        </TR>
        </TBODY>
    </TABLE>

    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
                    src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
            <TD vAlign=top width="100%" bgColor=#ffffff>
                <TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
                    <TR>
                        <TD class=manageHead>当前位置：客户管理 &gt; <s:if test="#customer.cust_id!=null">修改客户</s:if><s:else>添加客户</s:else></TD>
                    </TR>
                    <TR>
                        <TD height=2></TD>
                    </TR>
                </TABLE>

                <TABLE cellSpacing=0 cellPadding=5 border=0>
                    <TR>

                        <td>客户名称：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2 value="<S:property value="#customer.cust_name" />"
                                   style="WIDTH: 180px" maxLength=50 name="cust_name">
                        </td>
                        <td>客户级别 ：</td>
                        <td id="customerGrade">

                        </td>
                    </TR>

                    <TR>

                        <td>信息来源 ：</td>
                        <td id="customerSource">

                        </td>
                        <td>联系人：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2 type="text"
                                   style="WIDTH: 180px" maxLength=50 name="cust_linkman" value="<S:property
                                   value="#customer.cust_linkman" />"
                                    />
                        </td>
                    </TR>

                    <TR>


                        <td>固定电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2 value="<S:property value="#customer.cust_phone" />"
                                   style="WIDTH: 180px" maxLength=50 name="cust_phone">
                        </td>
                        <td>移动电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2 value="<S:property value="#customer.cust_mobile" />"
                                   style="WIDTH: 180px" maxLength=50 name="cust_mobile">
                        </td>
                    </TR>
                    <tr>
                        <td rowspan=2>
                            <INPUT class=button id=sButton2 type=submit
                                   value=" 保存 " name=sButton2>
                        </td>
                    </tr>
                </TABLE>


            </TD>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
                <IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
                              border=0></TD>
            <TD align=middle width="100%"
                background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
                              border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</BODY>
</HTML>
