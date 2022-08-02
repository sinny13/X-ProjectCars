<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp" %>



<%-- link rel="stylesheet" href="${ctx}/resources/css/wish.css">
  <div class="wish">
    <div class="product">
      <c:forEach var="wDtos" items="${wishList}">
      
      <c:if test="${wDtos == null}">    
      	<div>위시리스트가 업습니다.</div>
      </c:if>
      
      <c:if test="${wDtos != null}">
      <div class="product-card">
        <h2 class="name">${wDtos.company} ${wDtos.cName}</h2>
        <span class="price">${wDtos.price}만원</span>
        <a class="popup-btn">예약하기</a>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFTA-GU5hfvjuHibMn5hU5SRgt-NJUBiR5mw&usqp=CAU" class="product-img" alt="">
      </div>
      <div class="popup-view">
        <div class="popup-card">
          <a><i class="fas fa-times close-btn"></i></a>
          <div class="product-img">
            <img class="active" src="${ctx}/resources/file_upload/${wDtos.fileName}">
          </div>
          <div class="info">
            <h2>Xiomi 7 Smart Watch<br><span>Smart Sport Modes</span></h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            <span class="price">$100.00</span>
            <a href="#" class="add-cart-btn">Add to Cart</a>
            <a href="#" class="add-wish">Add to Wishlist</a>
          </div>
        </div>
      </div>
  		</c:if>
     </c:forEach>
      </div>
  </div> --%>
  

    <c:forEach var="wDtos" items="${wishList}">
  		<div>${wDtos.company}</div>
  	</c:forEach>
  
  
  
<%@ include file="../inc/footer.jsp" %>

