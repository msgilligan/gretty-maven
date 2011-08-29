import org.mbte.gretty.httpserver.* 

class MyServer
{
    public static void main(String[] args) throws Exception
    {
		GrettyServer server = [] 
		server.groovy = [ 
			localAddress: new InetSocketAddress("localhost", 8080), 
			defaultHandler: { 
				response.redirect "/" 
			}, 
			"/:name": {
				get {
					response.text = "Hello ${request.parameters['name']}"
				} 
			} 
		] 
		server.start()
	}
}