/*global cordova, module*/

module.exports = {

  check : function(params, success, error){
    cordova.exec(success, error, "VoiceCommand", "check", [params]);
  }
};
