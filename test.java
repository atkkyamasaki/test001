Connection conn = null;
try {
conn = DriverManager.getConnection ("jdbc: mysql: // localhost / test?" +
"user = steve & password = blue"); // Pattern 1

String uname = "steve";
String password = "blue";
conn = DriverManager.getConnection ("jdbc: mysql: // localhost / test?" +
"user =" + uname + "& password =" + password); // Pattern 2

java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication ("userName", "1234".toCharArray ()); // Pattern 3

Pattern 1. Character string (direct value), the character strings of "steve" and "blue" are directly embedded in the above DB connection execution process.
Pattern 2. The assigned character string and the above variables uname and password are assigned values ​​in plain text, which are used for the login information of the DB connection execution process.
Pattern 3. Embed character string, login information is given in the form of embedding in the above authentication object.
