		function validateName(){
			var firstName = document.forms["studentForm"]["firstname"].value;
			var lastName = document.forms["studentForm"]["lastname"].value;
			var email=document.forms["studentForm"]["email"].value;
			var city = document.forms["studentForm"]["city"].value;
			var country = document.forms["studentForm"]["country"].value;
			var zipcode = document.forms["studentForm"]["zipcode"].value;

			//firstname checker
			if (firstName == "") {
				alert("Your FirstName must be filled out");
				document.getElementById("firstname").focus();
				return false;
			}
			//lastname checker
			if(lastName == "" ) {
				alert("LastName must be filled out");
				document.getElementById("lastname").focus();
				return false;
			}
			
			//city
			if (city == "") {
				alert("Your city must be filled out");
				document.getElementById("city").focus();
				return false;
			}
			
			//country
			if (country.value == "-1") {
				alert("Your country must be selected");
				document.getElementById("country").focus();
				return false;
			}
			//country
			if(document.studentForm.country.selectedIndex=="")
			{
				alert ( "Please select country!");
				return false;
			}
			
			//zipcode
			if( zipcode.length == "" || isNaN( zipcode.length ) ||
            zipcode.length != 5 ) {
            
				alert( "Please provide a zip in the format #####." );
				document.studentForm.zipcode.focus() ;
				return false;
			}
			
			//email			
			if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)){
                console.log(true);
            }else{
                alert("You have entered an invalid email address!");
			    document.getElementById("email").focus();
                return false;
		    }
			
	}
	