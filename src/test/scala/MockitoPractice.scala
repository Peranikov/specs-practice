
import org.mockito.Mock
import org.specs2.mutable.Specification
import org.specs2.mock.Mockito

class MockitoPractice extends Specification with Mockito {

  val mockList = mock[java.util.List[String]]
  mockList.get(1) returns "one"

  "Mockito Spec1" >> {
    mockList.get(1) must_== "one"
  }
}
