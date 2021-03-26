void main(){
  var sB = new StringBuffer();
  //sB.writeln("|\\_/|\n").writeln("|q p|   /}\n").writeln("( 0 )\"\"\"\\\n").writeln("|\"^\"`    |\n").writeln("||_/=\\\\__|");
  sB.writeAll({'|\\_/|', '|q p|   /}', '( 0 )\"\"\"\\', '|\"^\"`    |', '||_/=\\\\__|'}, '\n');
  print(sB.toString());
}
