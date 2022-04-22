/**
 * 
 */
$(document).ready(function (){
	
	$("#fname").blur( function(){
		if($("#fname").val().length == 0)
			alert("name can not be empty");
	});
	
	
	$("#submit").click(
			function (){
				
				var fname = $("#fname").val();
				var lname = $("#lname").val();
				var age = $("#age").val();
				
				
				
				 /*var fname = document.getElementById('fname').value;
			        var lname = document.getElementById('lname').value;
			        var age = document.getElementById('age').value;
			        */
			        
				alert(fname.length);
				alert(fname);
				if (fname.length == 0) {
		            alert("Please input a first name");
		        } else if (lname.length == 0) {
		            alert("Please input a last name");
		        } else if (age.length == 0) {
		            alert("Please input an age");
		        }
		 
			});
	
});

