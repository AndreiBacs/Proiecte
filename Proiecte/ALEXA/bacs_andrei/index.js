var alexa= require('alexa-app');
var rp=require('request-promise');

module.change_code=1;

var gameElements=[
	'rock','paper','scissor'
];
var winnerTable=[
	2,0,1
];

var app=new alexa.app('bacs_andrei');
app.id=require('./package.json').alexa.applicationId;

app.launch(function(request,response){
	response
	.say("welcome to rock,paper,scissor! say let's go to begin")
	.reprompt("i'm waiting")
	.shouldEndSession(false);
});
app.intent("StartGameIntent",
{
	"slots" : {},
	"utterances":[
		"let's go"
	]
},function(request,response){
	var choosenElement=rand(0,2);
	var session = request.getSession();
	session.set("choosenElement",choosenElement);
	response
		.say("3. 2. 1. Go!")
		.reprompt("what is your choise?")
		.shouldEndSession(false);

});
app.intent("AnswerIntent",{
	"slots" : {
		"Response": "RPSLIST"
	},
	"utterances" : [
		"{Response}"
	]
},function(request,response){
	var session=request.getSession();
	var decision=request.slot("response");
	var alexaDecision=session.get("choosenElement");
	if(typeof alexaDecision=="undefined")
	{
		response
			.say('please,start game before answer.')
			.reprompt("i'm waiting")
			.shouldEndSession(false);
	}
	if(gameElements.lastIndexOf(decision)==-1){
		response
		.say('not a correct answer,please,try again.')
		.reprompt("i'm waiting")
		.shouldEndSession(false);
	}
	else{
		if(decision==gameElements[alexaDecision]){
			response.say(gameElements[alexaDecision]+". "+"draw!")
		}
		else{
			var i=gameElements.indexOf(decision);

			if(winnerTable[i]==alexaDecision)
			{
				response.say(gameElements[alexaDecision]+". "+"you win")
			}
			else{
				response.say(gameElements[alexaDecision]+". "+"you lose")
			}
		};
	}
});

app.intent("HelloWorldIntent",{

	"slots": {},
	"utterances":[
		"say hello world"
	],
}, function(request,response){
	response.say("hello world");
}
);

app.intent("RepeatIntent",{

	"slots": {
		"WORDS": "LITERAL"
	},
	"utterances":[
		"repeat {how are you|WORDS}"
	],
}, function(request,response){
	var words=request.slot("WORDS");
	response.say(words);
}
);

app.intent("NewsIntent",{

	"slots": {},
	"utterances":[
		"tell me the news"
	],
}, function(request,response){
	return getFeed().then(function(result){
		var s='';
		for(var i=0;i<3;i++)
		{	s+=result.items[i].title;
			if(s.lastIndexOf('.')!=s.length-1)
			{
				s+=".";
			}
			s+=" ";
			s+=result.items[i].description+". ";
			if(s.lastIndexOf('.')!=s.length-1){
				s+=".";
			}
			s+=" ";
		}
		response.say(s);
	});
});

app.intent("JokesIntent", {
  "slots": {},
  "utterances": [
    "tell me a joke"
  ],
}, function(request, response) {
	return getJoke().then(function(result) {
		response.say(result.value);
	});
});



module.exports=app;

function getFeed()
{
	var options = {
		uri : "https://api.rss2json.com/v1/api.json?rss_url=http://feeds.bbci.co.uk/news/rss.xml",
		json: true
	};
	return rp(options).then(function(result){
		return result;
	});
}

function getJoke() {
	var options = {
		uri: "https://api.chucknorris.io/jokes/random",
		json: true
	};

	return rp(options).then(function(result) {
		return result;
	});
}

function rand(min,max){

	return Math.round(min+Math.random()*max-min);
};