public class RivalPokemon extends Pokemon{


    //创建技能数组
    String[] skill1 ={"金属音","光栅炮","变硬","地震"};



    //设置精灵属性技能
    protected RivalPokemon(String name,int hp,int atk,int def){
        this.name=name;
        this.atk=atk;
        this.hp=hp;
        this.def=def;
        this.skill1[0]=skill1[0];
        this.skill1[1]=skill1[1];
        this.skill1[2]=skill1[2];
        this.skill1[3]=skill1[3];
    }



    //技能战斗方法
    private void fight1(MyPokemon mp){
        System.out.println(this.name+"对"+mp.name+"使用了"+skill1[0]);
        if(mp.def>0){
            mp.def-=10;
        }else{
            System.out.println(mp.name+"的防御已经无法降低\n");
        }
        System.out.println(mp.name+"的防御降低了\n");
        System.out.println(mp.name+"\n"+"hp: "+mp.hp+"\t攻击力: "+mp.atk+"\t防御力: "+mp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }
    private void fight2(MyPokemon mp){
        System.out.println(this.name+"对"+mp.name+"使用了"+skill1[1]+"，收效甚微，造成了"+(this.atk+120-mp.def)*0.6+"点伤害\n");
        mp.hp-=(this.atk+120-mp.def)*0.6;
        System.out.println(mp.name+"\n"+"hp: "+mp.hp+"\t攻击力: "+mp.atk+"\t防御力: "+mp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }
    private void fight3(MyPokemon mp){
        System.out.println(this.name+"使用了"+skill1[2]);
        if(this.def>=90){
            System.out.println(this.name+"已经不能再硬了。。。\n");
            System.out.println(mp.name+"\n"+"hp: "+mp.hp+"\t攻击力: "+mp.atk+"\t防御力: "+mp.def);
            System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
        }else{
            this.def+=10;
            System.out.println(this.name+"的防御增加了\n");
            System.out.println(mp.name+"\n"+"hp: "+mp.hp+"\t攻击力: "+mp.atk+"\t防御力: "+mp.def);
            System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
        }
    }
    private void fight4(MyPokemon mp){
        System.out.println(this.name+"对"+mp.name+"使用了"+skill1[3]+"，效果拔群，造成了"+(this.atk+100-mp.def)*2+"点伤害\n");
        mp.hp-=(this.atk+100-mp.def)*2;
        System.out.println(mp.name+"\n"+"hp: "+mp.hp+"\t攻击力: "+mp.atk+"\t防御力: "+mp.def);
        System.out.println(this.name+"\n"+"hp: "+this.hp+"\t攻击力: "+this.atk+"\t防御力: "+this.def+"\n");
    }



    //随机选择技能释放
    protected void Select(MyPokemon mp){
        int a;
        a=(int)(Math.random()*10+1);
        if(a<=2)
            fight1(mp);
        else if(a<=4)
            fight2(mp);
        else if(a<=6)
            fight3(mp);
        else
            fight4(mp);
    }
}
