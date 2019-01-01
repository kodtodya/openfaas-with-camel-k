from("timer:tick?period=3s")
  .setBody().constant("Hello World from Camel K!!!")
  .to("log:message")
