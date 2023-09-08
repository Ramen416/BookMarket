function addToCart(action) {
document.addForm.action = action;
document.addForm.submit();
alert('장바구니에 추가되엇습니다');
};

function removeFromCart(action) {
	document.removeForm.action = action;
	document.removeForm.submit();
	window.location.reload();
}

function clearCart() {
	document.clearForm.submit();
	window.location.reload();
}