function ValidateEmail(inputType)
{
    var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    if(inputType.value.match(mailformat))
    {
        alert("Valid email address!");
        document.myform.email_id.focus();
        return true;
    }
    else
    {
        alert("You have entered an invalid email address!");
        document.myform.email_id.focus();
        return false;
    }
}
