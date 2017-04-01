
module.exports = {

  test : function(name, success, error){
    cordova.exec(success, error, "VoiceCommand", "test", [name]);
  }
}
