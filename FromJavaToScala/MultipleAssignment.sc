def getPersoninfo(primaryKey : Int) = {
  // 假定primaryKey是用来获取用户信息的主键
  // 在这里写死响应的主体
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
}

val (firstName, lastName, emailAddress) = getPersoninfo(1)

println(s"First Name: $firstName")
println(s"Last Name: $lastName")
println(s"Email Address: $emailAddress")
