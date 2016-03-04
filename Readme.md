# salesforce-soql-java
Simple facade over salesforce soql calls.

Example usage:

```java
Soql soql = new Soql(myUsername, myPassword + mySecurityToken);  

for (SObject record: soql.executeQuery("SELECT FirstName, LastName, Title FROM User ORDER BY LastName")){
     System.out.format("%s %s %s\n", record.getField("LastName"), record.getField("FirstName"), record.getField("Title")); 
}

```