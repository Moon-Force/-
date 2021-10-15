var product=new Array("粉色13","红色ip13","黑色ip13","华为手机");
var price=new Array(9000,8999,8000,10000);
var result="";
var isSelected= new Array(0,0,0,0);
function clearAll(){
	isSelected=[0,0,0,0];
	myForm.sp0.checked=false;
	myForm.sp0.checked=false;
	myForm.sp0.checked=false;
	myForm.sp0.checked=false;
	alert("已重置")
}
function checkOut(){
	var total=0;
	var count=0;
	for(var i=0;i<isSelected.length;i++){
		count+=isSelected[i];
	}
	for(var i=0;i<price.length;i++){
		total=total+price[i]*isSelected[i];
	}
	alert(count+"件应付金额"+total);
}
function shoppingCart(){
	var selectList="";
	for(var j=0;j<product.length;j++){
		if(isSelected[j]){
			selectList+=(j+1)+"-"+product[j]+",价值"+price[j]+"\n";
		}
	}
	var info=(selectList=="")?"你的购物车为空":selectList;
	alert(info);
}
function checkSelect(number){
	var temp;
	switch(number){
		case 0:
		temp=myForm.sp0.checked; //改变状态
		break;
		case 1:
		temp=myForm.sp1.checked;
		break;
		case 2:
		temp=myForm.sp2.checked;
		break;
		case 3:
		temp=myForm.sp3.checked;
		break;
	}
	isSelected[number]=(temp)?1:0; //改变数组
}