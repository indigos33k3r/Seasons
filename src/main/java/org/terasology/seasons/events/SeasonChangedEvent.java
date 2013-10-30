/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.seasons.events;

import org.terasology.seasons.Season;

/**
 * Created with IntelliJ IDEA.
 * User: Linus
 * Date: 10/30/13
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class SeasonChangedEvent {

    public SeasonChangedEvent(Season from, Season to)
    {
        this.from = from;
        this.to = to;
    }

    public final Season fromSeason()
    {
        return from;
    }

    public final Season toSeason()
    {
        return to;
    }

    public final Season from;
    public final Season to;
}
