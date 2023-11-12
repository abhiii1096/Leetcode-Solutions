from collections import defaultdict, deque

class Solution:
    # Function to find the minimum number of buses needed to reach the target from the source.
    def numBusesToDestination(self, routes: List[List[int]], source: int, target: int) -> int:
        # If source and target are the same, no buses are needed.
        if source == target:
            return 0

        # Create an adjacency list to represent stops and the routes that include each stop.
        adj_list = defaultdict(list)
        for route, stops in enumerate(routes):
            for stop in stops:
                adj_list[stop].append(route)

        # Initialize a queue for BFS and a set to keep track of visited routes.
        q = deque()
        vis = set()

        # Insert all the routes in the queue that have the source stop.
        for route in adj_list.get(source, []):
            q.append(route)
            vis.add(route)

        bus_count = 1  # Initialize the bus count.

        # Perform BFS to find the minimum number of buses needed.
        while q:
            size = len(q)

            for i in range(size):
                route = q.popleft()

                # Iterate over the stops in the current route.
                for stop in routes[route]:
                    # Return the current count if the target is found.
                    if stop == target:
                        return bus_count

                    # Iterate over the next possible routes from the current stop.
                    for next_route in adj_list.get(stop, []):
                        if next_route not in vis:
                            vis.add(next_route)
                            q.append(next_route)

            bus_count += 1

        # If no route is found, return -1.
        return -1

