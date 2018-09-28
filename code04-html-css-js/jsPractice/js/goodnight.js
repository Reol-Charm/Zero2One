function bless() {
	var time = new Date();
	var hour = time.getHours();
	if(hour < 8 && hour > 6) {
		document.write("Good morning!" + "</br>");
	} else if(hour > 9 && hour < 16) {
		document.write("Good day!" + "</br>");
	} else {
		document.write("Good night!" + "</br>");
	}
}
bless();