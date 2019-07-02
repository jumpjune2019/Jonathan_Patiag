//define vars to hold time values
var seconds = 0; 
var minutes = 0;
var hours = 0;

//define vars to hold display values
var displaySeconds = 0;
var displayMinutes =0;
var displayHours = 0;

//var to hold setInterval() function
var interval = null;

//stopwatch status
var status = "stopped"; 
var correct = 0;
var wrong = 0;

var numQuest;
var termsArr = new Array();
var defsArr = new Array();

loadData();
function loadData() {
    //sets a variable equal to a new HTTP request
    var myRequest = new XMLHttpRequest();

    //get the file
    myRequest.open("GET", "quizstuff.json", true);

    myRequest.onload = function(){
        var termData = JSON.parse(myRequest.responseText);
        numQuest = termData.length;
        //display terms and definitions
        buildQuiz(termData);
        store(termData);
    }

    //send the request
    myRequest.send();
}

function buildQuiz(quizData){

    //get all the termWidgets
    var terms = document.getElementsByClassName("termWidget");
    var defs = document.getElementsByClassName("definitionText");

    numQuest = quizData.info.length;

    Math.random()

    //loop thru termWidgets and change to visible
    for (var i = 0; i < terms.length; i++) {
      terms[i].style.visibility = "visible";
      let x = Math.trunc(numQuest * Math.random());
      terms[i].innerHTML = quizData.info[x].term;
      defs[i].innerHTML = quizData.info[x].definition;
    }

    //loop thru termWidgets and change to visible
    for (var i = 0; i < defs.length; i++) {
      defs[i].style.visibility = "visible";
    }
}

function store(Data){
	for (var i = 0; i < Data.length; i++) {
		termsArr[i] = Data.info[i].term;
		console.log(termsArr[i]);
		defsArr[i] = Data.info[i].term;
	}
}

//this function controls what happens when the button called "startbutton" is pressed
function gameControl() {
	//this if statement occurs when the button is pressed when hitting "play" 
    if(document.getElementById("startButton").innerHTML == "Play"){
        document.getElementById("startButton").innerHTML = "Stop";
        document.getElementById("score").innerHTML = "Score Message Center";
        //starts the timer to 
        interval = window.setInterval(stopWatch, 1000); 
        for (var i = 0; i < 5; i++){ // loop through the 
        	//sets the attributes of "draggable" to "true" to make them draggable
            document.getElementsByClassName("termWidget")[i].setAttribute("draggable", "true"); 
            //sets the attributes of "unselectable" to off to make them selectable 
            document.getElementsByClassName("termWidget")[i].setAttribute("unselectable", "off");
        }
    //this if statement occurs when the button is pressed when hitting the button while it reads "stop"
   	} else if(document.getElementById("startButton").innerHTML == "Stop"){
        document.getElementById("startButton").innerHTML = "Score";
        window.clearInterval(interval); //stops the interval
        for (var i = 0; i < 5; i++){
            document.getElementsByClassName("termWidget")[i].setAttribute("draggable", "false");
            document.getElementsByClassName("termWidget")[i].setAttribute("unselectable", "on");
        }
    //this if statement occurs when the button is pressed when hitting "score"   
    } else if(document.getElementById("startButton").innerHTML =="Score"){
    	getAnswer();
        document.getElementById("startButton").innerHTML = "Play Again?";

    //this if statement occurs when the button is pressed when hitting "play again"    
    } else{
        document.getElementById("startButton").addEventListener("click", location.reload(true));
    }
}

function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
    console.log((ev.target.id));
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}

//this function 
function stopWatch() {
    seconds++;
    //logic to determine when to increment next value
    //
    if (seconds / 60 == 1){
        seconds = 0;
        minutes++;
    }
               
    if(minutes / 60 == 1){
        minutes = 0;
        hours++;
    }
      
    //logic to determine whe          
    if (seconds < 10) {
        displaySeconds = "0" + seconds.toString();
    } else {
        displaySeconds = seconds;
    }

    if (minutes < 10) {
        displayMinutes = "0" + minutes.toString();
    } else {
        displayMinutes = minutes;
    } if (hours < 10) {
        displayHours = "0" + hours.toString();
    } else {
        displayHours = hours;
    }
	//display updated time values to user
    document.getElementById("time").innerHTML = displayHours + ":" + displayMinutes + ":" + displaySeconds;
} 

function getAnswer(){
	var x = document.getElementById("def1").innerText;
	var y = document.getElementById("defWidget1").innerText;
	console.log(x);
	console.log(y);
}