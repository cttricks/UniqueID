function GetUniqueString(length, str){
	const AlphaNumericChars = "AqBi12CxbD3sjEyzFaGHtIcdeJKpL4MkN57lfOPuvQ6g8RwSTmnUoVW9XhYrZ";
	length = (length>0 && length) ? length : 1;
	str = (str) ? str : "";
	while(length > 0){
		str += AlphaNumericChars.charAt(Math.floor(Math.random() * 61));
		length --;
	}

	return str;
}


console.log(GetUniqueString(5,"ctricks"));
/*it will return 5 char long unique id - cttricks{UniqueID} | cttricks2d6er*/

console.log(GetUniqueString(10));
/*t will return 10 char long unique id | gsC1wEe5aN*/

console.log(GetUniqueString());
/*t will return a sigle char | g*/
