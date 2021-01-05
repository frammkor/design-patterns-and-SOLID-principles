# Dependency Inversion

#### High Level modules should not depend upon low level modules. Both should depend upon abstractions.
#### Abstraction should not depend upon details. Details should depend upon abstractions.

##### Wrong
Te problem with the following code is that we tightly coupling the report generation to this implementation.
If the requirements change (ex. we need a deferent format to be sended by mail) we would need to come and change the code.
`
public void writeReport() {
    Report report = new Report();
    // build the report
    JSONFormatter formatter = new JSONFormatter();
    String report = formatter.format(report);
    FileWriter writer = new FileWriter('report.json');
    // write out report
}
`

#### Solution

Dependency inversion proposes that 'high level modules' (a modules that implements some business rules) should not depend 'low level modules' (basic functionality that can be used anywhere). Instead of tightly coupling them, they should depend on abstraction (ex. the use of an interface).

`
public void writeReport(Formatter formatter, Writer writer) {
    Report report = new Report();
    // build the report
    String report = formatter.format(report);
    write out report
    writer.write('myreport');
}
`