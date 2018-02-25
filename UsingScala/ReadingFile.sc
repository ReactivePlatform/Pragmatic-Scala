import scala.io.Source
println("*** The content of the file you read is:")
                    
Source.fromFile("ReadingFile.sc").foreach { print } 
