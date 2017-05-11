
            // When the browser is ready...
            $(function () {

                // Setup form validation on the #register-form element
                $("#register-form").validate({
                    // Specify the validation rules
                    rules: {
                        firstname: {required: true},
                        secondname: {required: true},
                        surname: {required: true},
                        address1: {required: true},
                        address2: {required: true},
                        town: {required: true},
                        postcode: {required: true},
                        secondemail: {required: true, email: true},
                        // personalurl: {required: true},
                        // photo: {required: true},
                        studentstatus: {required: true},
                        mobile: {required: true, minlength: 10, number: true},
                        // landline: {required: true, minlength: 10, number: true},
                        dob: {required: true},
                        NoofGCSESpasses: {required: true},
                        userEmail: {required: true, email: true},
                        password: {required: true, minlength: 6},
                        agree: "required"
                    },
                    // Specify the validation error messages
                    messages: {
                        firstname: {required: "First Name required"},
                        secondname: {required: "Second Name required"},
                        surname: {required: "Surname required"},
                        address1: {required: "Address 1 required"},
                        address2: {required: "Address 2 required"},
                        town: {required: "Town required"},
                        postcode: {required: "Postcode required"},
                        secondemail: {required: "Please enter a valid email address"},
                        // photo: {required: "Please select your photo"},
                        studentstatus: {required: "Student Staus required"},
                        mobile: {required: "Mobile required"},
                        landline: {required: "Land Line required"},
                        dob: {required: "Date of Birth required"},
                        NoofGCSESpasses:{required: "No. of GCSE passes is required"},
                        userEmail: {required: "Enter valid email for your username"},
                        password: {required: "Field is required "},
                        agree: "Please accept our policy"

                    },
                    submitHandler: function (form) {
                        form.submit();
                    }
                });
                
                
                // Setup form validation on the #login-form element
                $("#login-form").validate({
                    // Specify the validation rules
                    rules: {
                        
                        userEmail: {required: true, email: true},
                        password: {required: true, minlength: 6},
                        agree: "required"
                    },
                    // Specify the validation error messages
                    messages: {
                        
                        userEmail: {required: "Enter valid email for your username"},
                        password: {required: "Field is required "},
                        agree: "Please accept our policy"

                    },
                    submitHandler: function (form) {
                        form.submit();
                    }
                });

            });

       
        // End jQuery Form Validation code