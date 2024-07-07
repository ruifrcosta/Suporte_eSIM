function checkSupport() {
    cordova.plugins.ESIMSupport.checkESIMSupport(function(result) {
        document.getElementById('result').innerHTML = "eSIM support: " + (result ? "Supported" : "Not Supported");
    }, function(err) {
        document.getElementById('result').innerHTML = "Error checking eSIM support: " + err;
    });
}
