// Copyright (c) October 2025 Félix-Olivier Dumas. All rights reserved.
// Licensed under the terms described in the LICENSE file

package com.ECS;

import com.ECS.components.AgeComponent;
import com.ECS.components.NameComponent;
import com.ECS.components.PositionComponent;
import com.ECS.components.VelocityComponent;
import com.ECS.ecs.Entity;  
import com.ECS.ecs.Registry;      

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Entity cat = new Entity();

        registry.addComponent(cat, new NameComponent(),
                                   new AgeComponent(),
                                   new PositionComponent(),
                                   new VelocityComponent());

        var name     = registry.getComponent(cat, NameComponent.class);
        var age      = registry.getComponent(cat, AgeComponent.class);
        var position = registry.getComponent(cat, PositionComponent.class);
        var velocity = registry.getComponent(cat, VelocityComponent.class);

        name.name = "Garfield"; age.age = 5;
        position.x = 10; position.y = 15;
        velocity.vx = 5; velocity.vy = 2;

        System.out.println("[Nom] " + name.name);
        System.out.println("[Age] " + age.age + " ans");
        System.out.println("[Position] (" + position.x + ", " + position.y + ")");
        System.out.println("[Velocity] (" + velocity.vx + ", " + velocity.vy + ")");
    }
}