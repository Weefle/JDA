/**
 *    Copyright 2015 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dv8tion.jda.entities.impl;

import net.dv8tion.jda.Permission;
import net.dv8tion.jda.entities.Role;

public class RoleImpl implements net.dv8tion.jda.entities.Role
{
    private final String id;
    private String name;
    private int color;
    private int position;
    private int permissions;
    private boolean managed, hoist;

    public RoleImpl(String id)
    {
        this.id = id;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getColor()
    {
        return color;
    }

    @Override
    public int getPosition()
    {
        return position;
    }

    @Override
    public boolean hasPermission(Permission perm)
    {
        return ((1 << perm.getOffset()) & permissions) > 0;
    }

    @Override
    public boolean isManaged()
    {
        return managed;
    }

    @Override
    public boolean isHoist()
    {
        return hoist;
    }

    public RoleImpl setName(String name)
    {
        this.name = name;
        return this;
    }

    public RoleImpl setColor(int color)
    {
        this.color = color;
        return this;
    }

    public RoleImpl setPosition(int position)
    {
        this.position = position;
        return this;
    }

    public RoleImpl setPermissions(int permissions)
    {
        this.permissions = permissions;
        return this;
    }

    public RoleImpl setManaged(boolean managed)
    {
        this.managed = managed;
        return this;
    }

    public RoleImpl setHoist(boolean hoist)
    {
        this.hoist = hoist;
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Role))
            return false;
        Role oRole = (Role) o;
        return this == oRole || this.getId().equals(oRole.getId());
    }

    @Override
    public int hashCode()
    {
        return getId().hashCode();
    }

}