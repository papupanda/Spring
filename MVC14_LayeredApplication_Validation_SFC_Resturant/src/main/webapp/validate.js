function validate(frm){
	var itemname=frm.itemname.value;
	var catagory=frm.catagory.value;
	var price=frm.price.value;
	var availabe=frm.availabe.value;
	
	frm.vflag.value="yes";
	
	if(itemname==""){
		document.getElementById("itemnameER").innerHTML="name is must be filled";
		alert(11);
		frm.itemname.focus();
		return false;
	}
	if(catagory==""){
		document.getElementById("catagoryER").innerHTML="catagory is must be filled";
		frm.catagory.focus();
		return false;
	}
	else if(catagory.length<=5){
		document.getElementById("catagoryER").innerHTML="catagory is must 5 letter";
		frm.catagory.focus();
		return false;
	}
	if(isNaN(price)){
		document.getElementById("priceER").innerHTML="price must be number";
		frm.catagory.focus();
		return false;
	}
	if(availabe==""){
		document.getElementById("availabeER").innerHTML="availabe is must be filled";
		frm.catagory.focus();
		return false;
	}
	
}
   
 