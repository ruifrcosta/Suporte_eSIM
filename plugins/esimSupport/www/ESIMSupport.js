var exec = require('cordova/exec');

exports.checkESIMSupport = function(success, error) {
    exec(success, error, 'ESIMSupport', 'checkESIMSupport', []);
};
