import org.specs2.mutable.Specification

class Matchers extends Specification {
  "Equality" >> {
    "must beEqualTo" >> {
      1 must beEqualTo(1)
    }

    "must be_==" >> {
      1 must be_==(1)
    }

    "must_==" >> {
      1 must_==(1)
    }

    "mustEqual" >> {
      1 mustEqual 1
    }

    "shoud_==" >> {
      1 should_==  1
    }

    "===" >> {
      1 ===  1
    }

    "must beEqualTo" >> {
      1 must beEqualTo(1)
    }
  }
}
