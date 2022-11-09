import React, { forwardRef } from 'react'

export default function user(props, ref) {
    return (
        <div>
            <input type="text" ref={ref} />
        </div>
    )
}
