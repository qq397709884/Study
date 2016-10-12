package com.e.test;

public class Test {

	/**
	 * 普通枚举
	 * @author 稳定
	 *
	 */
	public enum ColorEnum {
		
        red, green, yellow, blue;
    }
	
	/**
	 * 枚举像普通的类一样可以为她添加属性和方法
	 * @author 稳定
	 *
	 */
	public enum SeasonEnum {
        
        spring, summer, autumn, winter; // 枚举必须写在最前面，否则编译时会出错

        private final static String position = "春眠不觉晓";

        public static SeasonEnum getSeason() {
            if ("春眠不觉晓".equals(position))
                return spring;
            else
                return winter;
        }
    }
	
	/**
	 * 实现带有构造器的枚举
	 * @author 稳定
	 *
	 */
	public enum Gender{
        
        MAN("男"), WOMEN("女"); // 通过括号赋值，而且必须带有一个属性和构造器，赋值时必须都赋值或都不赋值，不能一部分赋值一部分不赋值，如果不赋值则不能写构造器
        
        private final String value;

        Gender(String value) {
            this.value = value;
        }        
    }
	
	/**
	 * 实现带有抽象方法的枚举
	 * @author 稳定
	 *
	 */
	public enum OrderState {

        CANCEL {
        	public String getName() {
        		return "已取消";
    		}
    	},
        WAITCONFIRM {
    		public String getName() {
    			return "待审核";
			}
		},
        WAITPAYMENT {
			public String getName() {
				return "等待付款";
			}
		},
        ADMEASUREPRODUCT {
			public String getName() {
				return "正在配货";
			}
		},
        WAITDELIVER {
			public String getName() {
				return "等待发货";
			}
		},
        DELIVERED {
			public String getName() {
				return "已发货";
			}
		},
        RECEIVED {
			public String getName() {
				return "已收货";
			}
		};
        
        public abstract String getName();
    }
	
	@org.junit.Test
	public void test() {
		
		//枚举是一种类型，用于定义变量，以限制变量的赋值，赋值时通过“枚举名.值”取得枚举中的值
		ColorEnum colorEnum = ColorEnum.blue;
        switch (colorEnum) {
        case red:
            System.out.println("color is red");
            break;
        case green:
            System.out.println("color is green");
            break;
        case yellow:
            System.out.println("color is yellow");
            break;
        case blue:
            System.out.println("color is blue");
            break;
        }
        //遍历枚举
        for(ColorEnum color : ColorEnum.values()){
            System.out.println(color);
        }
        //获取枚举的个数
        System.out.println(ColorEnum.values().length);
        //获取枚举的索引位置，默认从0开始
        System.out.println(ColorEnum.red.ordinal());
        System.out.println(ColorEnum.green.ordinal());
        System.out.println(ColorEnum.yellow.ordinal());
        System.out.println(ColorEnum.blue.ordinal());
        
        System.out.println(SeasonEnum.getSeason());
        
        for(Gender gender : Gender.values()){
            System.out.println(gender.value);
        }
        
        for(OrderState order : OrderState.values()){
            System.out.println(order.getName());
        }
	}
}
