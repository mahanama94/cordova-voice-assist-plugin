# Cordova Voice Command plugin

The library is a voice command plugin for cordova, supported with cordova and ionic. ( Supported by cordova base varients).

## Supprted platforms

The platform support is currently available only with android.

## Supported Actions

| Action| Remarks|
| ------------- |-------------|
|**Set Alarm** | `Supported` |
|**Set Timer** | `Supported` |
|**In App Search** | `Supported` |
|**Add calendar event** | `Under development` |  
|**Take video** | `Under development` |
|**Take picture** | `Under development` |
|**Media Play** | `Under development` |


## Quick install

`cordova plugin add https://github.com/mahanama94/cordova-voice-command-plugin.git`

## Usage

``` javascript

voicecommand.check(ConfigurationObject, SuccessCallback, ErrorCallback)

```

| Parameter| Description|
| ------------- |-------------|
| **`ConfigurationObject`**  | `Contains the configuration settings for the voice interactions.`|
| **`SuccessCallback`**     |  `Callback for the success of finding the application invocation.( For both implicit and explicit calls). With data containing the information of the event`    |
| **`ErrorCallback`**       | `Callback for the error of the process.`                                                                     |


<br><br>

##### ConfigurationObject


| Parameter| Description|Default|
| ------------- |-------------|------|
| **`remember`** | `The application should remember the type of Application call` | ```true ``` |

##### Data

| **`type`** | `Type of the implicit call Ex - SetAlarm (See Documentation)` |



## Documentation

Link for the complete Documentation of the plugin can be found in the Docs diectory.

## Sample Application

```javascript

function voiceCommandTest(){

  voicecommand.check([], function(message){
    // receive and handle the event parameters here
    // for explicit calls,  you can ignore
    console.log(message)
  }, function(){
    console.log('Error');
  })
}
```
You can attach the above function to an event according to the requirements of the application.
