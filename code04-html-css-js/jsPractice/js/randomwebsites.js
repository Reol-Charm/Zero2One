//onload = function() {
function randWeb() {
	var ran = Math.floor(Math.random() * 100) + 1;
	if(ran % 2 == 0) {
		document.write("<a href='https://www.youtube.com'> youtube 一下!</a>");
	} else if(ran % 3 == 0) {
		document.write("<a href='https://www.dilidili.wang'>dilidili!</a>");
	} else {
		document.write("<a href='https://www.w3cschool.com'>大辞典了解一下!</a> " + "</br>")
	}
}
randWeb();
//}