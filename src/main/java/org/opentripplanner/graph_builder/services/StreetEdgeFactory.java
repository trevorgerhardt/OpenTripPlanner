/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.graph_builder.services;

import org.opentripplanner.routing.edgetype.AreaEdge;
import org.opentripplanner.routing.edgetype.AreaEdgeList;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.StreetTraversalPermission;
import org.opentripplanner.routing.vertextype.IntersectionVertex;

import com.vividsolutions.jts.geom.LineString;

/**
 * Edge factory to build StreetEdge and AreaEdge.
 * 
 * We use a factory to be able to build either StreetEdge or StreetWithElevationEdge, depending on
 * whether you want elevation data later on or not.
 * 
 */
public interface StreetEdgeFactory {

    public StreetEdge createEdge(IntersectionVertex startEndpoint, IntersectionVertex endEndpoint,
            LineString geometry, String name, double length, StreetTraversalPermission permissions,
            boolean back);

    public AreaEdge createAreaEdge(IntersectionVertex startEndpoint,
            IntersectionVertex endEndpoint, LineString geometry, String name, double length,
            StreetTraversalPermission permissions, boolean back, AreaEdgeList area);

}
