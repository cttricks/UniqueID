public String Create() {
  int n = 10; // here n is the length of string you want as output
  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
  StringBuilder sb = new StringBuilder(n);
  for(int i=0; i<n; i++){
          int index = (int)(AlphaNumericString.length() * Math.random());
          sb.append(AlphaNumericString.charAt(index));
  }
  
  return sb.toString();
}
