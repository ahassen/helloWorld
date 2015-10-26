package helloworld

class HelloController {
  def world = {
    render "<html><head><title>Hello</title></head><body><div>Hello World from Release!</div></body></html>"
  }
}
