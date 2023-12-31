import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Tank;

public class TankTest 
{
    @Test
    public void tank_isAlive_true_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(1);

        assertEquals(true, tank1.isAlive());
        assertTrue(tank1.isAlive());
    }


    @Test
    public void tank_isAlive_false_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(5);

        assertEquals(false, tank1.isAlive());
        assertFalse(tank1.isAlive());
    }

    @Test
    public void tank_damage_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(1);

        assertEquals(4.0, tank1.getHealth());

        tank1.damage(4);

        assertEquals(0.0, tank1.getHealth());
        assertFalse(tank1.isAlive());
    }

    @Test
    public void tank_repair_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(4);
        tank1.repair(1);

        assertEquals(2.0, tank1.getHealth());

        tank1.repair(4);

        assertEquals(6.0, tank1.getHealth());
        assertTrue(tank1.isAlive());
    }

    @Test
    public void tank_has_pilot_false_test(){
        Tank tank1 = new Tank();

        assertFalse(tank1.hasPilot());
    }

    @Test
    public void name_test(){
        Tank tank1 = new Tank();

        assertEquals("", tank1.getName());
        tank1.setName("Pedrito");
        assertEquals("Pedrito", tank1.getName());

    }
}