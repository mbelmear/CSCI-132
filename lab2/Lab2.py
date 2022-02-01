

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def reflect_x(self):
        newX = self.x
        newY = self.y * -1
        return Point(newX, newY)

    def get_line_to(self, endPoint):
        x1 = self.x
        x2 = endPoint.x
        y1 = self.y
        y2 = endPoint.y
        
        m = (y2 - y1)/(x2 - x1)
        
        b = (y1- (m*x1))

        #print(b)
        
        
        return ("y =" + str(m) + "x + " + str(b))

def main():


    first = Point(3, -5)
    second = first.reflect_x()
    #### Exercise 2
    print("First (" + str(first.x) + ", " + str(first.y) + ") Second (" + str(second.x) + ", " + str(second.y) + ")")
    ### Exercise 4
    print(Point(4, 11).get_line_to(Point(6, 15)))

main()
