package com.gcdandlcm.test;

public class Test {

	@org.junit.Test
	public void test() {
		
		int m = 12;
		int n = 8;
		System.out.println("GCD:" + GCD(m, n));
		System.out.println("LCM:" + LCM(m, n));
	}
	
	/**
	 * 最大公约数
	 * @param m
	 * @param n
	 * @return
	 */
    public int GCD(int m, int n) {  
    
    	//保证m>n，若m<n，则进行数据交换
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    /**
     * 最小公倍数
     * @param m
     * @param n
     * @return
     */
    public int LCM(int m, int n) {
        
    	return m * n / GCD(m, n);
    }
}