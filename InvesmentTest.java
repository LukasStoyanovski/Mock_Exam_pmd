public class InvesmentTest{
    @Test
    public void invest_roi_PositiveParams(){
        assert(1758, Investment.invest(1500, 4.3, 4));
    }
    @Test
    public void invest_roi_PositiveParams(){
        assert(3828, Investment.invest(3000, 4.6, 6));
    }
    @Test
    public void invest_roi_PositiveParams(){
        assert(1195, Investment.invest(1000, 3.9, 5));
    }
    @Test
    public void invest_roi_PositiveParams(){
        assert(1758, Investment.invest(1500, 4.3, 4));
    }
    @Test
    public void invest_roi_PositiveParams(){
        assert(1758, Investment.invest(1500, 4.3, 4));
    }

    // example 
    // @Test
    // public void <nameOfMethodBeingTested>_<nameOfSum>_<StateUnderTest>(){
    //     assert(<sum>, <fileOfFunction>.<nameOfMethod>(<params>))
    // }
}