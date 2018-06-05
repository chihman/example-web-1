// Attach a submit handler to the form
$( "#login" ).submit(function( event ) {
 
  // Stop form from submitting normally
  event.preventDefault();
 
  // Get some values from elements on the page:
  var $form = $( this ),
    user = $form.find( "input[name='user']" ).val(),
	pass = $form.find("input[name='pass']").val();
 
  // Send the data using post
  var posting = $.post( "/update", { user: user, pass:pass } );
 
  // Put the results in a div
  posting.done(function( data ) {
	  console.log(data);
  });
});

$("#refreshMsgs").onclick(function(event){
	$.get("/get_msg").done(function(data){
		console.log(data);
	});
});

$("#refreshUsers").onclick(function(event){
	$.get("/get_msg").done(function(data){
		console.log(data);
	});
});

$("#postBtn").onclick(function(event){
	$.post("/post_msg").done(function(data){
		console.log(data);
	});
});