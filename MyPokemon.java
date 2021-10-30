import java.util.*;

public class MyPokemon extends Pokemon{
    //创建技能数组
    String[][] skill ={{"  A  "," B ","    C  ","     D  "},{"火焰踢","剑舞","百万吨飞踢","劈瓦"},{" 90 "," 0 ","   120  "," 90"}};



    //设置精灵属性技能
    protected MyPokemon(String name,int hp,int atk,int def){
        this.name=name;
        this.atk=atk;
        this.hp=hp;
        this.def=def;
        this.skill[1][0]=skill[1][0];
        this.skill[1][1]=skill[1][1];
        this.skill[1][2]=skill[1][2];
        this.skill[1][3]=skill[1][3];
    }




    //打印技能列表
    protected void skillLine(){
        System.out.println("请选择技能: \n");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                System.out.print("\t"+skill[i][j]+"\t");
            }
            System.out.println();
        }
    }




    //技能战斗方法
    private void fight1(RivalPokemon rp){
        System.out.println(this.name+"对"+rp.name+"使用了"+skill[1][0]+"，效果拔群，造成了"+(this.atk+90-rp.def)*2+"点伤害\n");
        rp.hp-=(this.atk+90-rp.def)*2;
        System.out.println(rp.name+"\n"+"hp: "+rp.hp+"\t攻击力: "+rp.atk+"\t防御力: "+rp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }
    private void fight2(RivalPokemon rp){
        System.out.println(this.name+"使用了"+skill[1][1]);
        if(this.atk>=110){
            System.out.println(this.name+"的攻击力已经无法提升\n");
            System.out.println(rp.name+"\n"+"hp: "+rp.hp+"\t攻击力: "+rp.atk+"\t防御力: "+rp.def);
            System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
        }else{
            this.atk=this.atk+20;
            System.out.println(this.name+"的攻击力大幅提升\n");
            System.out.println(rp.name+"\n"+"hp: "+rp.hp+"\t攻击力: "+rp.atk+"\t防御力: "+rp.def);
            System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
        }
    }
    private void fight3(RivalPokemon rp){
        System.out.println(this.name+"对"+rp.name+"使用了"+skill[1][2]+",收效甚微，造成了"+(this.atk+120-rp.def)*0.6+"点伤害\n");
        rp.hp-=(this.atk+120-rp.def)*0.6;
        System.out.println(rp.name+"\n"+"hp: "+rp.hp+"\t攻击力: "+rp.atk+"\t防御力: "+rp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }
    private void fight4(RivalPokemon rp){
        System.out.println(this.name+"对"+rp.name+"使用了"+skill[1][3]+",收效甚微，造成了"+(this.atk+90-rp.def)*0.6+"点伤害\n");
        rp.hp-=(this.atk+90-rp.def)*0.6;
        System.out.println(rp.name+"\n"+"hp: "+rp.hp+"\t攻击力: "+rp.atk+"\t防御力: "+rp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }



    //技能选择方法
    protected void  Select(RivalPokemon rp){
        Scanner t = new Scanner(System.in);
        char x = t.next().charAt(0);
        if (x=='A'){
            this.fight1(rp);
        }else if(x=='B'){
            this.fight2(rp);
        }else if(x=='C'){
            this.fight3(rp);
        }else if(x=='D'){
            this.fight4(rp);
        }
    }


}
